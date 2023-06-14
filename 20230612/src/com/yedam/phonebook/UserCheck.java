package com.yedam.phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;

class User {
	String id;
	String pw;

	User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

}

public class UserCheck {
	// id pw 입력후 있으면 true 없으면 false

	HashSet<User> userList = new HashSet<>();

	UserCheck() {
		readFromFile();
	}

	public boolean loginCheck(String id, String pw) {
		Iterator<User> iter = userList.iterator();
		while (iter.hasNext()) {
			User user = iter.next();
			if (user.equals(id) && user.equals(pw)) {
				return true;
			}
		}
		return false;
	}

	public void readFromFile() {
		// c:/temp/userList.txt
		try {
			FileReader fr = new FileReader("c:/temp/userList.txt");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				String[] record = str.split(" ");
				userList.add(new User(record[0], record[1]));
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}

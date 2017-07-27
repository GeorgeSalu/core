package br.com.java8.stream.modulo4;

import java.util.List;
import java.util.stream.Stream;

import br.com.java8.stream.util.Employee;

public class MapDemo {
	
	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList();
		Stream<Player> players = list.stream().map(e -> new Player(e.id, e.name));
		players.forEach(p -> System.out.println(p.id+", "+p.name));
	}

	static class Player {
		int id;
		String name;

		public Player(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

	}

}

package _07_duck;

public class Duck {
		String favFood;
		int numberOfFriends;
		public Duck (String food, int friends) {
			this.favFood = food;
			this.numberOfFriends = friends;
			
			}
			void quack() {
				System.out.println("Duck quacks at their " + numberOfFriends + " friends");
		}
		}

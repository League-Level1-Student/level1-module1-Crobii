package _06_vault;

public class VaultRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vault vault = new Vault();
		vault.tryCode(1239);
		System.out.println(vault.tryCode(1239));
		SecretAgent agent = new SecretAgent();
		int estimation = agent.findCode(vault);
		if(estimation == -1) {
			System.out.println("False");
		}
		else {
			System.out.println("The code is " + estimation);
		}
	}

}

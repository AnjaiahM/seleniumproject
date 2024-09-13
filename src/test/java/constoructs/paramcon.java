package constoructs;

public class paramcon {
public paramcon(int i) {
	System.out.println("int1");
}

public paramcon(paramcon par) {
	System.out.println("param");
}

public static void main(String[] args) {
	paramcon p=new paramcon(null);
}
}

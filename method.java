public class method{
	public static void one( ){
		System.out.println("BSCS");
	}
	public static int two(int p, int q){
		int sub;
		sub = p-q;
		return sub;
	}

public static void main(String[] args)
{
  one( );
  int p = Integer.parseInt(args[0]);
  int q = Integer.parseInt(args[1]);
 
  System.out.println(two(p , q));
}
}
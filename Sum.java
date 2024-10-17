public class Sum{
	public static int sum(int a,int b,int c){
		int largest,smallest;
		if(a>b){
			if(a>c){
				largest=a;
				if(b>c)
					smallest=c;
				else
					smallest=b;
			}else{
				largest=c;
				if(a>b)
					smallest=b;
				else
					smallest=a;
			}
		}else{
			if(b>c){
				largest=b;
				if(a>c)
					smallest=c;
				else
					smallest=a;
			}else{
				largest=c;
				if(a>b)
					smallest=b;
				else
					smallest=a;
			}
		}
		
		return largest+smallest;
	}
	public static void main(String[] args){
		System.out.println(sum(2,8,6));
	}
}
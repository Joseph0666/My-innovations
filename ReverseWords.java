package LogicPrograms;

public class ReverseWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		char[] ch=str.toCharArray();
		int i;
		String s1="";
		for(i=str.length()-1;i>=0;i--){
			s1=s1+ch[i];
		}
		//System.out.println(s1);
		String s4="";
		String[] s3=s1.split(" ");
		for(String w:s3){
			StringBuffer s2=new StringBuffer(w);
			s2.reverse().toString();
			s4=s4+s2+" ";
			}
		System.out.println(s4);
	}

}

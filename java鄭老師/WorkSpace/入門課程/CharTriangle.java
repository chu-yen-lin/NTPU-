class CharTriangle {
public static void main(String[]args) {
	java.util.Scanner sc = new java.util.Scanner (System.in);
	System.out.print("輸入高:");
int level=sc.nextInt();
for(int i=0; i<level; i++){
       for(int j=0; j<level-1-i;j++){System.out.print(" ");
}
char c = (char)('A'+i);
for(int k=0; k<2*i+1;k++){System.out.print(c);
}
System.out.println();
}
}
}
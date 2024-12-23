class TwoThree {
public static void main(String[]args) {
java.util.Scanner sc = new java.util.Scanner (System.in,"Big5");
System.out.print ("輸入數字:");
int a = sc.nextInt();
if(a%6==0)
System.out.println(a+"是2跟3的公倍數");
else if (a%2==0)
System.out.println(a+"是2的倍數");
else if (a%3==0)
System.out.println(a+"是3的倍數");
else
System.out.println(a+"不是2也不是3的倍數");
}
}

//另一種寫法
if(a%2==0){
	System.out.println(a+"是2的倍數");
	if(a%3==0)
	System.out.println(a+"是3的倍數");
    else
System.out.println();}
else{
	if(a%3==0)
		System.out.println(a+"是3的倍數");
	else
		System.out.println(a+"不是2也不是3的倍數");
}
}
}

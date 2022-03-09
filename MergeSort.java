import java.util.*;
import java.text.*;
import java.io.*;
import java.math.*;
public class code5 {
	InputStream is;
	PrintWriter out;
	static long mod=pow(10,9)+7;
	static int dx[]={0,0,1,-1},dy[]={1,-1,0,0};
	long req[];
 	void solve() throws Exception
	{
 		int n=ni();
 		int k=ni();
 		if(k%2==0||k>count(0,n-1))
 			out.print(-1);
 		else
 		{
 			int arr[]=new int[n+1];
 			for(int i=0;i<n;i++)
 				arr[i]=i;
 			this.k=k-1;
 			ans(arr,0,n);
 			for(int i=0;i<arr.length-1;i++)
 				out.print((arr[i]+1)+" ");
 		}

	}
 	int k;
 	void ans(int arr[],int l,int r)
 	{
 		if(k==0)
 			return;
 		if(l+1==r)
 			return;
 		int mid=(l+r)/2;
 		int temp=arr[mid-1];
 		arr[mid-1]=arr[mid];
 		arr[mid]=temp;
 		k-=2;
 		ans(arr,l,mid);
 		ans(arr,mid,r);
 	}
 	boolean check(int arr[],int l,int r)
 	{
 		for(int i=l+1;i<=r;i++)
 		{
 			if(arr[i]<arr[i-1])
 				return false;
 		}
 		return true;
 	}
 	int count(int l,int r)
 	{
 		if(l==r)
 			return 1;
 		if(l>r)
 			return 0;
 		int mid=(l+r)/2;
 		return 1+count(l,mid)+count(mid+1,r);
 	}
 	ArrayList<Pair> al[];
 	void take(int n,int m)
 	{
 		al=new ArrayList[n];
 		for(int i=0;i<n;i++)
 			al[i]=new ArrayList<Pair>();
 		for(int i=0;i<m;i++)
 		{
 			int x=ni()-1;
 			int y=ni()-1;
 			int w=ni();
 			al[x].add(new Pair(y,w,-1));
 			al[y].add(new Pair(x,w,-1));
 		}
 	}
 	int check(long n)
 	{
 		int count=0;
 		while(n!=0)
 		{
 			if(n%10!=0)
 				break;
 			n/=10;
 			count++;
 		}
 		return count;
 	}
	public static int count(int x)
	{
		int num=0;
		while(x!=0)
		{
			x=x&(x-1);
			num++;
		}
		return num;
	}
	static long d, x, y;
	void extendedEuclid(long A, long B) {
	    if(B == 0) {
	        d = A;
	        x = 1;
	        y = 0;
	    }
	    else {
	        extendedEuclid(B, A%B);
	        long temp = x;
	        x = y;
	        y = temp - (A/B)*y;
	    }
	}
	long modInverse(long A,long M) //A and M are coprime
	{
	    extendedEuclid(A,M);
	    return (x%M+M)%M;    //x may be negative
	}
	public static void mergeSort(int[] arr, int l ,int r){
		if((r-l)>=1){
			int mid = (l+r)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,r,mid);
		}
	}
	public static void merge(int arr[], int l, int r, int mid){
		int n1 = (mid-l+1), n2 = (r-mid);
		int left[] = new int[n1];
		int right[] = new int[n2];
		for(int i =0 ;i<n1;i++) left[i] = arr[l+i];
		for(int i =0 ;i<n2;i++) right[i] = arr[mid+1+i];
		int i =0, j =0, k = l;
		while(i<n1 && j<n2){
			if(left[i]>right[j]){
				arr[k++] = right[j++];
			}
			else{
				arr[k++] = left[i++];
			}
		}
		while(i<n1) arr[k++] = left[i++];
		while(j<n2) arr[k++] = right[j++];
	}
	public static void mergeSort(long[] arr, int l ,int r){
		if((r-l)>=1){
			int mid = (l+r)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,r,mid);
		}
	}
	public static void merge(long arr[], int l, int r, int mid){
		int n1 = (mid-l+1), n2 = (r-mid);
		long left[] = new long[n1];
		long right[] = new long[n2];
		for(int i =0 ;i<n1;i++) left[i] = arr[l+i];
		for(int i =0 ;i<n2;i++) right[i] = arr[mid+1+i];
		int i =0, j =0, k = l;
		while(i<n1 && j<n2){
			if(left[i]>right[j]){
				arr[k++] = right[j++];
			}
			else{
				arr[k++] = left[i++];
			}
		}
		while(i<n1) arr[k++] = left[i++];
		while(j<n2) arr[k++] = right[j++];
	}
	 static class Pair implements Comparable<Pair>{

	       int x,y,k;
	       int i,dir;
		Pair (int xx,int yy,int k){
			this.x=xx;
			this.y=yy;
			this.k=k;
		}
		public int compareTo(Pair o) {
			if(this.y!=o.y)
				return this.y-o.y;
			return this.k-o.k;
		}

		public String toString(){
			return x+" "+y+" "+k+" "+i;}
		public boolean equals(Object o) {
			if (o instanceof Pair) {
				Pair p = (Pair)o;
				return p.x == x && p.y == y;
			}
			return false;
		}
		public int hashCode() {
			return new Long(x).hashCode()*31 + new Long(y).hashCode() ;
		}
	}

	    public static boolean isPal(String s){
	        for(int i=0, j=s.length()-1;i<=j;i++,j--){
	                if(s.charAt(i)!=s.charAt(j)) return false;
	        }
	        return true;
	    }
	    public static String rev(String s){
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			return sb.toString();
	    }

	    public static long gcd(long x,long y){
		if(y==0)
			return x;
		else
			return gcd(y,x%y);
	    }

	    public static int gcd(int x,int y){
	    	if(y==0)
	    		return x;
	    	return gcd(y,x%y);
	    }

	    public static long gcdExtended(long a,long b,long[] x){

	        if(a==0){
	            x[0]=0;
	            x[1]=1;
	            return b;
	        }
	        long[] y=new long[2];
	        long gcd=gcdExtended(b%a, a, y);

	        x[0]=y[1]-(b/a)*y[0];
	        x[1]=y[0];

	        return gcd;
	    }

	    public static int abs(int a,int b){
		return (int)Math.abs(a-b);
	    }

	    public static long abs(long a,long b){
		return (long)Math.abs(a-b);
	    }

	    public static int max(int a,int b){
		if(a>b)
			return a;
		else
			return b;
	    }

	    public static int min(int a,int b){
		if(a>b)
			return b;
		else
			return a;
	    }

	    public static long max(long a,long b){
		if(a>b)
			return a;
		else
			return b;
	    }

	    public static long min(long a,long b){
		if(a>b)
			return b;
		else
			return a;
	    }

	    public static long pow(long n,long p,long m){
		 long  result = 1;
		  if(p==0)
		    return 1;
		if (p==1)
		    return n;
		while(p!=0)
		{
		    if(p%2==1)
		        result *= n;
		    if(result>=m)
		    result%=m;
		    p >>=1;
		    n*=n;
		    if(n>=m)
		    n%=m;
		}
		return result;
	    }

	    public static long pow(long n,long p){
		long  result = 1;
		  if(p==0)
		    return 1;
		if (p==1)
		    return n;
		while(p!=0)
		{
		    if(p%2==1)
		        result *= n;
		    p >>=1;
		    n*=n;
		}
		return result;
	    }
	    public static void debug(Object... o) {
			System.out.println(Arrays.deepToString(o));
		}
	    void run() throws Exception {
			is = System.in;
			out = new PrintWriter(System.out);
			solve();
			out.flush();
		}

	    public static void main(String[] args) throws Exception {
			new Thread(null, new Runnable() {
				public void run() {
					try {
						new code5().run();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}, "1", 1 << 26).start();

	    	//new code5().run();
		}
	    private byte[] inbuf = new byte[1024];
		public int lenbuf = 0, ptrbuf = 0;

		private int readByte() {
			if (lenbuf == -1)
				throw new InputMismatchException();
			if (ptrbuf >= lenbuf) {
				ptrbuf = 0;
				try {
					lenbuf = is.read(inbuf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return -1;
			}
			return inbuf[ptrbuf++];
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b));
			return b;
		}

		private double nd() {
			return Double.parseDouble(ns());
		}

		private char nc() {
			return (char) skip();
		}

		private String ns() {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		private char[] ns(int n) {
			char[] buf = new char[n];
			int b = skip(), p = 0;
			while (p < n && !(isSpaceChar(b))) {
				buf[p++] = (char) b;
				b = readByte();
			}
			return n == p ? buf : Arrays.copyOf(buf, p);
		}

		private char[][] nm(int n, int m) {
			char[][] map = new char[n][];
			for (int i = 0; i < n; i++)
				map[i] = ns(m);
			return map;
		}

		private int[] na(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = ni();
			return a;
		}
		private long[] nl(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nl();
			return a;
		}

		private int ni() {
			int num = 0, b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}

			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
				b = readByte();
			}
		}

		private long nl() {
			long num = 0;
			int b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}

			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
				b = readByte();
			}
		}

}
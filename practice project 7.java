package practiceprograms;
class outerc{
	void outershow() {
		System.out.println("outer class");		
	}
	class innerc{
		void innershow() {
			System.out.println("inner class");
		}	
	}
}
public class innerclass {
        public static void main(String[] args) {
        	outerc a = new outerc();
        	outerc.innerc b= a.new innerc();
        	a.outershow();
        	b.innershow();
        	
        }
}



	import java.util.LinkedList;

	public class TestEmployee {
		public static void main(String[]args) {
			LinkedList<Employee> v=addInput();
			display(v);
		}
		public static LinkedList<Employee> addInput(){
			Employee e1=new Employee(101,"Abhi","Patna");
			Employee e2=new Employee(102,"Vivek","Bangalore");
			Employee e3=new Employee(103,"Amit","Dhanbad");
			LinkedList<Employee>v = new LinkedList<Employee>();
			v.add(e1);
			v.add(e2);
			v.add(e3);
			return v;



		}
		public static void display(LinkedList<Employee>v)
		{
			for(Employee e:v)
			{
				System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
			}
		}

	}



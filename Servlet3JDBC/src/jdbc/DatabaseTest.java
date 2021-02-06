package jdbc;
import java.util.List;

public class DatabaseTest {

	public static void main(String[] args) {
		MyDatabase mdb = new MyDatabase();
		//mdb.connectDb();
		//mdb.insert();
		//mdb.select_all();

		/*
		//Insert-2
		int sn = 101;
		String name = "Rajan";
		String address="USA";
		String email ="rajan@gamil.com";
		String phone ="987654545454";

		if(mdb.insert(sn, name, address, email, phone)) {
			System.out.println("Inserted!");
		}
		else {
			System.out.println("Error to insert!");
		}
		 */

		/*
		//Insert-3
		System.out.print("Enter ID : ");
		int sn = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter Name : ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("Enter Address : ");
		String address=new Scanner(System.in).nextLine();
		System.out.print("Enter Email : ");
		String email =new Scanner(System.in).nextLine();
		System.out.print("Enter Phone : ");
		String phone =new Scanner(System.in).nextLine();

		if(mdb.insert(sn, name, address, email, phone)) {
			System.out.println("Inserted!");
		}
		else {
			System.out.println("Error to insert!");
		}
		mdb.select_all();

		Contact contact=new Contact(1, "Krishna","NEP","krishna@1444", "98275975");
		mdb.insert(contact);

		//Delete Records
		System.out.print("Enter SN : ");
		int sn = new Scanner(System.in).nextInt();
		Contact tmp =mdb.search(sn);
		if (tmp.getSn()>0) {
			System.out.println(tmp);		
			System.out.print("Enter Name : ");
			String name = new Scanner(System.in).nextLine();
			System.out.print("Enter Address : ");
			String address=new Scanner(System.in).nextLine();
			System.out.print("Enter Email : ");
			String email =new Scanner(System.in).nextLine();
			System.out.print("Enter Phone : ");
			String phone =new Scanner(System.in).nextLine();

			tmp.setName(name);
			tmp.setAddress(address);
			tmp.setEmail(email);
			tmp.setPhone(phone);
			if (mdb.update(tmp)) {
				System.out.println("Record updated!");
			}
			else {
				System.out.println("Error to update record");
			}
		}
		else {
			System.out.println("Record not found!");
		}
		 

		//Record Delete
		System.out.print("Enter SN : ");
		int sn = new Scanner(System.in).nextInt();
		Contact tmp =mdb.search(sn);
		if (tmp.getSn()>0) {
			System.out.println(tmp);
			System.out.print("Do you want to delete record (Y/N) : ");			
			String tmp_str = new Scanner(System.in).nextLine();			
			char ch = tmp_str.charAt(0);
			if((ch =='y') || (ch=='Y')) {
				if(mdb.delete(sn)) {
					System.out.println("Delete record successfully");
				}
				else {
					System.out.println("Error to delete record");
				}
			}
			else {
				System.out.println("Bye!");								
			}
		}
		else {
			System.out.println("Record not found!");
		}
		*/
		
		String search_text = "Manish";
		List persons = mdb.searchV2(search_text);
		System.out.println(persons.size());
		
	}
}
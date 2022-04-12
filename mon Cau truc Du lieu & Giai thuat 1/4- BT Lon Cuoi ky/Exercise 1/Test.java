import java.util.*;
import java.io.*;

/*
 * DO NOT ADD PACKAGE TO THIS FILE
 * @author Thanh Dai Khoa [517H0008]
 */

public class Test { 

	public static void main(String[] args) throws Exception {

		ArrayList<SinhVien> sinhvien = new ArrayList<SinhVien>();		// khoi tao ArrayList luu thong tin danh sach SV
		ArrayList<GiangVien> giangvien = new ArrayList<GiangVien>();	// khoi tao ArrayList luu thong tin danh sach GV
		ArrayList<MonHoc> monhoc = new ArrayList<MonHoc>();				// khoi tao ArrayList luu thong tin danh sach mon hoc
	
		ArrayList<String> arr = new ArrayList<String>();
		
		try{

			File f = new File("input.dat");
			FileReader freader = new FileReader(f);
			Scanner myScan = new Scanner(freader);		// doc file input.dat
			
			while(myScan.hasNext()){

				String a = myScan.nextLine();

				if(a.trim().isEmpty()) 	// kiem tra dong vua doc vao neu khong co ki tu nao thi ctrinh se bo qua dong nay
					continue;

				String[] b = a.split(",");
				
				for(String w: b){  

					String[] c = w.split("\\t");
					
					for(String z: c){

						arr.add(z.trim());

					}

				}  

			}

			myScan.close();
			freader.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			System.exit(1);

		}
		
		for(int i = 0; i < arr.size(); i++){	// doc file va luu cac thông tin vao cac arrayList sinhvien, giangvien, monhoc

			if(arr.get(i).equals("#SinhVien")){

				String id = arr.get(i + 1);
				String name = arr.get(i + 2);
				char gender = arr.get(i + 3).charAt(0);

				sinhvien.add(new SinhVien(id, name, gender));

			}
			
			if(arr.get(i).equals("#GiangVien")){

				String id = arr.get(i + 1);
				String name = arr.get(i + 2);
				char gender = arr.get(i + 3).charAt(0);

				giangvien.add(new GiangVien(id, name, gender));

			}
			
			if(arr.get(i).equals("#MonHoc")){

				String maMH = arr.get(i + 1);
				String tenMH = arr.get(i + 2);
				int tinChi = Integer.parseInt(arr.get(i + 3));

				monhoc.add(new MonHoc(maMH, tenMH, tinChi));

			}

		}
		
		int[] soTinChiTichLuy = new int[1000];	  // khoi tao bien array luu so tin chi tich luy cua SV
		for(int i = 0; i < 999; i++){

			soTinChiTichLuy[i] = 0;

		}
		
		int[] soLopGiangDay = new int[1000];	 // khoi tao bien array luu so lop giang day cua GV
		for(int i = 0; i < 999; i++){

			soLopGiangDay[i] = 0;

		}
			
		for(int i = 0; i < arr.size(); i++){

			// Cau b: Tính số tín chỉ tích lũy cho mỗi đối tượng sinh viên - students.dat
			if(arr.get(i).equals("#svTKB")){

				for(int sv = 0; sv < sinhvien.size(); sv++){

					if((sinhvien.get(sv).id).equals(arr.get(i + 1))){

						for(int mh = 0; mh < monhoc.size(); mh++){

							if(monhoc.get(mh).getMaMH().equals(arr.get(i + 2))){

								sinhvien.get(sv).addMonHoc(monhoc.get(mh));

								soTinChiTichLuy[sv]= soTinChiTichLuy[sv] + monhoc.get(mh).getTinChi();
								sinhvien.get(sv).setSoTinChiTichLuy(soTinChiTichLuy[sv]);
								
								// System.out.println(sinhvien.get(sv).id);
								// System.out.println(sinhvien.get(sv).getSvTKB());

							}

						}

					}

				}

			}
			
			// Cau c: Tính tổng số lớp mà giảng viên tham gia giảng dạy - teachers.dat
			if(arr.get(i).equals("#gvTKB")){

				for(int gv = 0; gv < giangvien.size(); gv++){

					if((giangvien.get(gv).id).equals(arr.get(i + 1))){

						for(int mh = 0; mh < monhoc.size(); mh++){

							if(monhoc.get(mh).getMaMH().equals(arr.get(i + 2))){

								giangvien.get(gv).addMonHoc(monhoc.get(mh));

								soLopGiangDay[gv]= soLopGiangDay[gv] + 1;
								giangvien.get(gv).setSoLopGiangDay(soLopGiangDay[gv]);
								
								// System.out.println(giangvien.get(gv).id);
								// System.out.println(giangvien.get(gv).getGvTKB());

							}

						}

					}

				}
				
			}	

		}
		
		System.out.println(arr);

		System.out.println("\n #SinhVien:");
	    for(int i = 0; i < sinhvien.size(); i++){

			System.out.println(sinhvien.get(i).id);
			System.out.println(sinhvien.get(i).name);
			System.out.println(sinhvien.get(i).gender);
			
			System.out.println(sinhvien.get(i).getSoTinChiTichLuy());
			System.out.println("----------");

		}

		System.out.println("\n #GiangVien:");
		for(int i = 0; i < giangvien.size(); i++){

			System.out.println(giangvien.get(i).id);
			System.out.println(giangvien.get(i).name);
			System.out.println(giangvien.get(i).gender);
			
			System.out.println(giangvien.get(i).getSoLopGiangDay());
			System.out.println("----------");

		}

		System.out.println("\n #MonHoc:");
		for(int i = 0; i < monhoc.size(); i++){

			System.out.println(monhoc.get(i).getMaMH());
			System.out.println(monhoc.get(i).getTenMH());
			System.out.println(monhoc.get(i).getTinChi());

			System.out.println("----------");

		}
		
		// Cau b: Tính số tín chỉ tích lũy cho mỗi đối tượng sinh viên - students.dat
		try{

			File f1 = new File("students.dat");
			FileWriter fwriter1 = new FileWriter(f1);		// ghi du lieu vao file students.dat
			
			for(int sv = 0; sv < sinhvien.size(); sv++){
				
				fwriter1.write(sinhvien.get(sv).id + ", " + sinhvien.get(sv).name + ", " + sinhvien.get(sv).gender + ", " + sinhvien.get(sv).getSoTinChiTichLuy());
				fwriter1.write(System.getProperty("line.separator"));		// xuong dong
				
			}	
			
			fwriter1.close();
			
		} catch(FileNotFoundException e) {

			e.printStackTrace();
			System.exit(1);

		}
		
		// Cau c: Tính tổng số lớp mà giảng viên tham gia giảng dạy - teachers.dat
		try{

			File f2 = new File("teachers.dat");
			FileWriter fwriter2 = new FileWriter(f2);		// ghi du lieu vao file teachers.dat
			
			for(int gv = 0; gv < giangvien.size(); gv++){
			
				fwriter2.write(giangvien.get(gv).id + ", " + giangvien.get(gv).name + ", " + giangvien.get(gv).gender + ", " + giangvien.get(gv).getSoLopGiangDay());
				fwriter2.write(System.getProperty("line.separator"));		// xuong dong
			
			}
			
			fwriter2.close();

		} catch(FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		// Cau d: Tìm những môn hoc mà một sinh viên đang theo hoc, tham số đầu vào là MSSV
		try{

			File f3 = new File("4d.dat");
			FileWriter w3 = new FileWriter(f3);		// ghi du lieu vao file 4d.dat
			
			for(int i = 0; i < arr.size(); i++){

				if(arr.get(i).equals("#svTKB")){

					if( (arr.get(i + 1)).equals(arr.get(0)) ){	   // tham số đầu vào là MSSV: arr.get(0)

						for(int mh = 0; mh < monhoc.size(); mh++){

							if(monhoc.get(mh).getMaMH().equals(arr.get(i + 2))){
								
								w3.write(monhoc.get(mh).getMaMH() + ", " + monhoc.get(mh).getTenMH() + ", " + monhoc.get(mh).getTinChi());
								w3.write(System.getProperty("line.separator"));
								
							}

						}

					}

				}

			}
			
			w3.close();

		} catch(FileNotFoundException e) {

			e.printStackTrace();
			System.exit(1);

		}
		
		// Cau e: Trả ve danh sách sinh viên của một môn hoc, tham số đầu vào là MaMH. Trả ve danh sách rỗng (size = 0) nếu không có sinh viên theo hoc
		try{

			File f4 = new File("4e.dat");
			FileWriter w4 = new FileWriter(f4);		// ghi du lieu vao file 4e.dat
			
			for(int i = 0; i < arr.size(); i++){

				if(arr.get(i).equals("#svTKB")){

					if( (arr.get(i + 2)).equals(arr.get(1)) ){	   // tham số đầu vào là Ma so Mon hoc: arr.get(1)

						for(int sv = 0; sv < sinhvien.size(); sv++){

							if(sinhvien.get(sv).id.equals(arr.get(i + 1))){
								
								w4.write(sinhvien.get(sv).id + ", " + sinhvien.get(sv).name + ", " + sinhvien.get(sv).gender);
								w4.write(System.getProperty("line.separator"));
								
							}

						}

					}

				}

			}
			
			w4.close();

		} catch(FileNotFoundException e) {

			e.printStackTrace();
			System.exit(1);

		}
		
		// Cau f: Trả ve danh sách môn hoc của một giảng viên, tham số đầu vào là MaGV. Trả ve danh sách rỗng (size = 0) nếu giảng viên không dạy môn hoc nào
		try{

			File f5 = new File("4f.dat");
			FileWriter w5 = new FileWriter(f5);		// ghi du lieu vao file 4f.dat
			
			for(int i = 0; i < arr.size(); i++){

				if(arr.get(i).equals("#gvTKB")){

					if( (arr.get(i + 1)).equals(arr.get(2)) ){	   // tham số đầu vào là Ma so GV: arr.get(2)

						for(int mh = 0; mh < monhoc.size(); mh++){

							if(monhoc.get(mh).getMaMH().equals(arr.get(i + 2))){
								
								w5.write(monhoc.get(mh).getMaMH() + ", " + monhoc.get(mh).getTenMH() + ", " + monhoc.get(mh).getTinChi());
								w5.write(System.getProperty("line.separator"));
								//w5.write(System.lineSeparator());
								
							}

						}

					}

				}

			}
			
			w5.close();

		} catch(FileNotFoundException e) {

			e.printStackTrace();
			System.exit(1);

		}

    }   

}
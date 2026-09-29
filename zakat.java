public class zakat{
public static void main(String[] args) {
    long [] penghasilanBulan ={2400000, 2600000, 2800000, 2800000, 2800000, 2800000, 2800000, 2800000, 2800000, 2800000, 2800000, 2800000,  };
    long [] pengeluaranBulan ={1500000, 1600000, 1700000, 1900000, 2000000, 1700000, 1700000, 1700000, 1700000, 1700000, 1700000, 1700000,  }; 
    long nisab = 10000000;

    long totalPenghasilan = 0;
    long totalPengeluaran = 0;

        
        for (int i = 0; i < penghasilanBulan.length; i++) {
            totalPenghasilan += penghasilanBulan[i];
            totalPengeluaran += pengeluaranBulan[i];
        }

    long surplus = totalPenghasilan - totalPengeluaran ; 
    long Zakat = (long) (surplus * 0.025);

     System.out.println("Total Penghasilan  : " + totalPenghasilan);
     System.out.println("Total Pengeluaran  : " + totalPengeluaran);
     System.out.println("Surplus            : " + surplus);
     System.out.println("Nisab              : " + nisab);
        
  

        if (surplus >= nisab) {
            System.out.println("kategori              :muzakki ");
            System.out.println("zakat  : " + Zakat);
            System.out.println("zakat                    : " + Zakat);
        } 
        else {
            System.out.println("kategori               : mustahik " );
            System.out.println("zakat                  : 0 ");
        }

       
        
}




}
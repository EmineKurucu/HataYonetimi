//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[3]); // 3. index yok
        } catch (Exception exception){
            System.out.println("Hata!");
            System.out.println(exception);
        }finally {
            System.out.println("Ne olursa olsun burasi calisir");
        }

        // ornegin veritabanına bağlandın ve hata oluştu veri tabanına bağlantı oluşturduktan sonra
        // çıkarken bağlantıyı kapatman gerekir finally bloğunu böyle bir durumda kullan
        // birden fazla catch bloğu yazılabilir

        /* exception yazılan koddan alınan hatalardır. Try catch ile kontrol altına alınabilir
        Errorlar kodlarla müdahale edemeyeceğimiz hatalardır
         */
    }
}
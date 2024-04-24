public class main {
    public static void main(String[] args) {
        try{
            Form_Siswa form = new Form_Siswa();
            form.setVisible(true);
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}

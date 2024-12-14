
    package OgrenciDersProgramiUygulamasi;

    public class Bilgiler{
        private String dersAdi;
        private String hocaAdi;
        private String dersGunu;
        private String dersSaati;
        private String amfi;

        public Bilgiler(String dersAdi, String hocaAdi, String dersGunu, String dersSaati, String amfi) {
            this.dersAdi = dersAdi;
            this.hocaAdi = hocaAdi;
            this.dersGunu = dersGunu;
            this.dersSaati = dersSaati;
            this.amfi = amfi;
        }

        public String getDersAdi() {
            return dersAdi;
        }

        public String getHocaAdi() {
            return hocaAdi;
        }

        public String getDersGunu() {
            return dersGunu;
        }

        public String getDersSaati() {
            return dersSaati;
        }

        public String getAmfi() {
            return amfi;
        }

        public void dersBilgileriniGoster() {
            System.out.println("Ders Adı: " + dersAdi);
            System.out.println("Hoca Adı: " + hocaAdi);
            System.out.println("Ders Günü: " + dersGunu);
            System.out.println("Ders Saati: " + dersSaati);
            System.out.println("Amfi: " + amfi);
        }
    }

public class Point {

    private String nom;
    private int abscisse;
    private int ordonnee;

    Point(String n,int a,int b){
        nom=n;
        abscisse=a;
        ordonnee=b;
    }

    Point(int a,int b){
        nom="p";
        abscisse=a;
        ordonnee=b;
    }

    Point(int a){
        nom="p";
        abscisse=a;
        ordonnee=2*a;
    }

    void Affiche(){
        System.out.println(nom+"("+abscisse+","+ordonnee+")");
    }

    void TranslHoriz(int a){
        abscisse=abscisse+a;
    }

    void TranslVert(int a){
        ordonnee=ordonnee+a;
    }

    void Translation(int a,int b){
        abscisse=abscisse+a;
        ordonnee=ordonnee+b;
    }

    boolean Coincide(Point p){
        if(abscisse==p.abscisse&&ordonnee==p.ordonnee){
            return true;
        }else{
            return false;
        }
    }

    String getNom(){
        return nom;
    }

    int getAbscisse(){
        return abscisse;
    }

    int getOrdonnee(){
        return ordonnee;
    }

    void setNom(String ch){
        nom=ch;
    }

    void setAbscisse(int a){
        abscisse=a;
    }

    void setOrdonnee(int a){
        ordonnee=a;
    }

    public static void main(String[] args){

        Point p1;
        p1=new Point(3,5);

        Point p2;
        p2=new Point(4);

        Point p3;
        p3=new Point("b",3,5);

        System.out.println("\n---------------------------\n");
        System.out.println("les points créés sont :");

        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n---------------------------\n");

        if(p1.Coincide(p3)==true)
            System.out.println("Les 2 points p1 et p3 coïncident");
        else
            System.out.println("Les 2 points ne coïncident pas");

        System.out.println("\n---------------------------\n");
        System.out.println("translation des points");

        p1.TranslHoriz(4);
        p2.TranslVert(3);
        p3.Translation(5,2);

        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n---------------------------\n");
        System.out.println("modification des attributs des points");

        p1.setNom("SRI21");
        p2.setAbscisse(25);
        p3.setOrdonnee(50);

        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n---------------------------\n");
        System.out.println("utilisation des méthodes get");

        String x=p1.getNom();
        int y=p1.getAbscisse();
        int z=p1.getOrdonnee();

        System.out.println("le nom du point p1 est : "+x);
        System.out.println("son abscisse est : "+y);
        System.out.println("son ordonnee est : "+z);
    }
}
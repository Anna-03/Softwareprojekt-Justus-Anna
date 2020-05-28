
/**
 * Beschreiben Sie hier die Klasse Patienten.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Patienten
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int Age;
    private String Name;
    private String Prename;
    private double dateofbirth;
    private String Insurance;
    private String Gender;

    /**
     * Konstruktor für Objekte der Klasse Patienten
     */
    public Patienten(String a, String b, int c, double d, String e, String f)
    {
        // Instanzvariable initialisieren
        Name = a;
        Prename = b;
        Age = c;
        dateofbirth = d;
        Insurance = e;
        Gender = f;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode()
    {
        // tragen Sie hier den Code ein
        return Age;
    }
}



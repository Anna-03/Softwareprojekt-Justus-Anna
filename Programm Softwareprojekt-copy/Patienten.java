/**
 * Beschreiben Sie hier die Klasse Patienten.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Patienten
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    

    /**
     * Konstruktor für Objekte der Klasse Patienten
     */
    public Patienten()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    
    int n;
    Patienten[] Patient;
    Patient Patienten = new Patienten[n];
    
    public Patienten nächster(Patient[] Patienten)
    {
        nächster = Patient[0];
    }
    public void nachrücken () {
      for (int p=0; p<n-1; p++) {
         Patient[p] = Patient [p++];
        }
    }
}
    public class User {
    int uid;
    String vorname;
    String nachname;
    String email;
    String username;
    Datum geb;
    

    public User(String v, String n, String geb) {
        this.vorname = v;
        this.nachname = n;
        this.geb = new Datum(geb);
        // generiere Username
        setUsername();
    }
    
    public void printData()	{
			System.out.println(this.nachname+", "+this.vorname+" - "+this.username);
	}
	// Methode generiert den Default-Username
    public void setUsername()   {
        // kopiere Werte der Klassenvariablen
			String vn = this.vorname;
            String nn = this.nachname; 

			// ändere Umlaute, Sonderzeichen + Leerstellen
			vn = vn.toLowerCase();
			vn = vn.replace("ä","ae");
			vn = vn.replace("ö","oe");
			vn = vn.replace("ü","ue");
			vn = vn.replace("ß","ss");
			vn = vn.replace(" ","");
			nn = nn.toLowerCase();
			nn = nn.replace("ä","ae");
			nn = nn.replace("ö","oe");
			nn = nn.replace("ü","ue");
			nn = nn.replace("ß","ss");
			nn = nn.replace(" ","");
			
			// lege Variablen an: 
			String ersterTeil = "";
			String zweiterTeil = "";

			// prüfe ob Nachname, Vorname < Länge zwei
			if(vn.length()<3)	{
				ersterTeil = vn;
			}
			else
			{
				ersterTeil = vn.substring(0,3);
			}
			if(nn.length()<3)	{
				ersterTeil = nn;
			}
			else
			{
				zweiterTeil = nn.substring(0,3);
			}
            // Baue Username zusammen
			this.username = "100" + ersterTeil+zweiterTeil+geb.getTTMM4LETTERS();
    }

    // GETTER/SETTER
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Datum getGeb() {
        return geb;
    }
    public void setGeb(Datum geb) {
        this.geb = geb;
    }

   
}

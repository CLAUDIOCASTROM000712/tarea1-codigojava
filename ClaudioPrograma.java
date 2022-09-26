class Claudioprograma{
    public static void main(String args[]){
        cliente.persona= (persona1) Cliente.getNombre("felix castro gonzales");
        cliente.persona= (persona1) Cliente.getEdad(52);
        cliente.persona= (persona1) Cliente.getDinero(900.50);
        cliente.persona= (persona1) Cliente.getRfc("cagf700712387");
        System.out.println(nombre persona1);
        System.out.println(edad persona1);
        System.out.println(dinero persona1);
        System.out.println(rfc persona1);

    }

}

class Persona{
    private String nombre;
    private int edad;
    private String rfc;
    private float dinero;

    private int noTrabajador;
    private float sueldo;
    private String area;
    private String sucursal;
    private int noSubalternos;

    private Cliente cliente;
    private Asesor asesor;
    private Gerente gerente;

    public Persona(){
        nombre="felix castro gonzales";
        edad=52;
        rfc="cagf700712387";
        dinero=900.50;
        noTrabajador=16;
        sueldo=300.50;
        area="electronica";
        sucursal="elcentro";
        noSubalternos=2;

        cliente=new Cliente();
        asesor=new Asesor();
        gerente=new Gerente();
    }

}

class Cliente extends Persona{
    super.Persona();
    private String nombre;
    private int edad;
    private float dinero;
    private String rfc;

    public Cliente(String nombre,int edad,float dinero,String rfc){
        this.nombre=nombre;
        this.edad=edad;
        this.dinero=dinero;
        this.rfc=rfc;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public float getDinero(){
        return dinero;
    }
    public String getRfc(){
        return rfc;
    }

}
/*
class Asesor extends Persona{
    super.Persona();
    private int noTrabajador;
    private float sueldo;
    private String area;

    public Asesor(int noTrabajador,float sueldo,String area){
        this.noTrabajador=noTrabajador;
        this.sueldo=sueldo;
        this.area=area;
    }
    public float getSueldo(){
        return sueldo;
    }
    public String getArea(){
        return area;
    }

}

class Gerente extends Persona{
    super.Persona();
    private int noSubalternos;
    private String sucursal;
    
    public Gerente(int noSubalternos,String sucursal){
        this.noSubalternos=noSubalternos;
        this.sucursal=sucursal;
    }
    public int getNoSubalternos(){
        return noSubalternos;
    }
    public String getSurcusal(){
        return sucursal;
    }

}
*/

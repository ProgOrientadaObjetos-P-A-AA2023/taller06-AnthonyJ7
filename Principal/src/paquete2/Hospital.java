/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ASUS
 */
public class Hospital {
    
    private String nombre;
    private CiudHospital ciudHospital;
    private int nroespe;
    private Medico[] medico;
    private Enfermero[] enfermero;
    private double sueldoTotal;
    private String direccHospital;
    
    public Hospital(String n, CiudHospital c, int ne, Medico[] m, Enfermero[] e, String d){
    
        nombre = n;
        ciudHospital = c;
        nroespe = ne;
        medico = m;
        enfermero = e;
        direccHospital = d;
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CiudHospital getCiudHospital() {
        return ciudHospital;
    }

    public void setCiudHospital(CiudHospital ciudHospital) {
        this.ciudHospital = ciudHospital;
    }

    public int getNroespe() {
        return nroespe;
    }

    public void setNroespe(int nroespe) {
        this.nroespe = nroespe;
    }

    public Medico[] getMedico() {
        return medico;
    }

    public void setMedico(Medico[] medico) {
        this.medico = medico;
    }

    public Enfermero[] getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero[] enfermero) {
        this.enfermero = enfermero;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal(Medico[] a, Enfermero[] b) {
        
        double s1=0;
        double s2=0;
        
        for (int i=0;i<a.length;i++) {
            s1 += a[i].getSueldoMes();
        }
        for (int i=0;i<b.length;i++) {
            s2 += b[i].getSueldoMes();
        }
        sueldoTotal = s1+s2;
        
    }

    public String getDireccHospital() {
        return direccHospital;
    }

    public void setDireccHospital(String direccHospital) {
        this.direccHospital = direccHospital;
    }
    
        @Override
        
        public String toString(){
               
        String cadena = String.format("%S\nDirección: %s\n"
                + "Ciudad: %s\nProvincia: %s\nNúmero de especialidades: %d\n",
                getNombre(),getDireccHospital(),getCiudHospital().getNombre(),
                getCiudHospital().getProvincia(),getNroespe());
        
        cadena = String.format("%sListado de médicos\n",cadena);
        
        for (int i = 0; i < getMedico().length; i++) {
            cadena = String.format("%s- %s - %.2f - %s\n",
                    cadena, 
                    getMedico()[i].getNombreDoc(),
                    getMedico()[i].getSueldoMes(),
                    getMedico()[i].getEspecialidad());
        }
        
        cadena = String.format("%s\nListado de enfermeros(as)\n",cadena);
        
        for (int i = 0; i < getEnfermero().length; i++) {
            cadena = String.format("%s- %s - %.2f - %s\n", 
                    cadena, 
                    getEnfermero()[i].getNombreEm(),      
                    getEnfermero()[i].getSueldoMes(),
                    getEnfermero()[i].getTipo());
        }
        
        cadena = String.format("%s\nTotal de Sueldos a pagar: %.2f",
                cadena, getSueldoTotal());
        return cadena;
    }
    
    
    
    
    
}

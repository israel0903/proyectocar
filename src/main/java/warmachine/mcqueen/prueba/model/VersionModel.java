
package warmachine.mcqueen.prueba.model;

import java.util.ArrayList;

public class VersionModel {
    
    private int idVersion;
    private String nombre;
    private String detalle;
    private int puertas;
    private int pasajeros;
    private float cilindrada;
    private float rendimiento;
    private int capacidadMaletero;
    private int airbags;
    private boolean aireAcondicionado;
    private boolean cierreCentralizado;
    private boolean alzaVidriosElectrico;
    private boolean camaraRetroceso;
    private CombustibleModel combustible;
    private CarroceriaModel carroceria;
    private TransmisionModel transmision;
    private TraccionModel traccion;
    private ModeloModel modelo;

    public static ArrayList<VersionModel> versiones = new ArrayList<>();
    
    public int getIdVersion() {
        return idVersion;
    }

    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCierreCentralizado() {
        return cierreCentralizado;
    }

    public void setCierreCentralizado(boolean cierreCentralizado) {
        this.cierreCentralizado = cierreCentralizado;
    }

    public boolean isAlzaVidriosElectrico() {
        return alzaVidriosElectrico;
    }

    public void setAlzaVidriosElectrico(boolean alzaVidriosElectrico) {
        this.alzaVidriosElectrico = alzaVidriosElectrico;
    }

    public boolean isCamaraRetroceso() {
        return camaraRetroceso;
    }

    public void setCamaraRetroceso(boolean camaraRetroceso) {
        this.camaraRetroceso = camaraRetroceso;
    }

    public CombustibleModel getCombustible() {
        return combustible;
    }

    public void setCombustible(CombustibleModel combustible) {
        this.combustible = combustible;
    }

    public CarroceriaModel getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(CarroceriaModel carroceria) {
        this.carroceria = carroceria;
    }

    public TransmisionModel getTransmision() {
        return transmision;
    }

    public void setTransmision(TransmisionModel transmision) {
        this.transmision = transmision;
    }

    public TraccionModel getTraccion() {
        return traccion;
    }

    public void setTraccion(TraccionModel traccion) {
        this.traccion = traccion;
    }

    public ModeloModel getModelo() {
        return modelo;
    }

    public void setModelo(ModeloModel modelo) {
        this.modelo = modelo;
    }

    public VersionModel() {
    }

    public VersionModel(String nombre, String detalle, int puertas, int pasajeros, float cilindrada, float rendimiento, int capacidadMaletero, int airbags, boolean aireAcondicionado, boolean cierreCentralizado, boolean alzaVidriosElectrico, boolean camaraRetroceso, CombustibleModel combustible, CarroceriaModel carroceria, TransmisionModel transmision, TraccionModel traccion, ModeloModel modelo) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.puertas = puertas;
        this.pasajeros = pasajeros;
        this.cilindrada = cilindrada;
        this.rendimiento = rendimiento;
        this.capacidadMaletero = capacidadMaletero;
        this.airbags = airbags;
        this.aireAcondicionado = aireAcondicionado;
        this.cierreCentralizado = cierreCentralizado;
        this.alzaVidriosElectrico = alzaVidriosElectrico;
        this.camaraRetroceso = camaraRetroceso;
        this.combustible = combustible;
        this.carroceria = carroceria;
        this.transmision = transmision;
        this.traccion = traccion;
        this.modelo = modelo;
    }

    private VersionModel(int idVersion, String nombre, String detalle, int puertas, int pasajeros, float cilindrada, float rendimiento, int capacidadMaletero, int airbags, boolean aireAcondicionado, boolean cierreCentralizado, boolean alzaVidriosElectrico, boolean camaraRetroceso, CombustibleModel combustible, CarroceriaModel carroceria, TransmisionModel transmision, TraccionModel traccion, ModeloModel modelo) {
        this.idVersion = idVersion;
        this.nombre = nombre;
        this.detalle = detalle;
        this.puertas = puertas;
        this.pasajeros = pasajeros;
        this.cilindrada = cilindrada;
        this.rendimiento = rendimiento;
        this.capacidadMaletero = capacidadMaletero;
        this.airbags = airbags;
        this.aireAcondicionado = aireAcondicionado;
        this.cierreCentralizado = cierreCentralizado;
        this.alzaVidriosElectrico = alzaVidriosElectrico;
        this.camaraRetroceso = camaraRetroceso;
        this.combustible = combustible;
        this.carroceria = carroceria;
        this.transmision = transmision;
        this.traccion = traccion;
        this.modelo = modelo;
    }
    
    public boolean nuevaVersion(VersionModel nuevaVersion){
    
        int id = 0;
        
        if (!versiones.isEmpty()) {
            
            for (VersionModel version : versiones) {
                if (version.getIdVersion()> id) {
                    id = version.getIdVersion();
                }
            }
            
        }
        
        id++;
        
        versiones.add(new VersionModel(id, nuevaVersion.getNombre(), nuevaVersion.getDetalle(), nuevaVersion.getPuertas(), nuevaVersion.getPasajeros(), nuevaVersion.getCilindrada(), nuevaVersion.getRendimiento(), nuevaVersion.getCapacidadMaletero(), nuevaVersion.getAirbags(), nuevaVersion.isAireAcondicionado(), nuevaVersion.isCierreCentralizado(), nuevaVersion.isAlzaVidriosElectrico(), nuevaVersion.isCamaraRetroceso(), nuevaVersion.getCombustible(), nuevaVersion.getCarroceria(), nuevaVersion.getTransmision(), nuevaVersion.getTraccion(), nuevaVersion.getModelo()));
         
        return true;
    }
    
    public VersionModel buscaVersion(int idVersionBuscada){
    
        VersionModel versionEncontrada = null;
        
        if(!versiones.isEmpty()){
            for (VersionModel version : versiones) {
                if (version.getIdVersion()== idVersionBuscada) {
                    versionEncontrada = version;
                }
            }
        }
        
        return versionEncontrada;
        
    }
    
    public VersionModel editarVersion(int idVersion, VersionModel versionEditar){
    
        VersionModel versionEditada = null;
        
        if(!versiones.isEmpty()){
            for (VersionModel version : versiones) {
                if (version.getIdVersion()== idVersion) {
                    version.setNombre(versionEditar.getNombre());
                    version.setDetalle(versionEditar.getDetalle());
                    version.setPuertas(versionEditar.getPuertas());
                    version.setPasajeros(versionEditar.getPasajeros());
                    version.setCilindrada(versionEditar.getCilindrada());
                    version.setRendimiento(versionEditar.getRendimiento());
                    version.setCapacidadMaletero(versionEditar.getCapacidadMaletero());
                    version.setAirbags(versionEditar.getAirbags());
                    version.setAireAcondicionado(versionEditar.isAireAcondicionado());
                    version.setCierreCentralizado(versionEditar.isCierreCentralizado());
                    version.setAlzaVidriosElectrico(versionEditar.isAlzaVidriosElectrico());
                    version.setCamaraRetroceso(versionEditar.isCamaraRetroceso());
                    version.setCombustible(versionEditar.getCombustible());
                    version.setCarroceria(versionEditar.getCarroceria());
                    version.setTransmision(versionEditar.getTransmision());
                    version.setTraccion(versionEditar.getTraccion());
                    version.setModelo(versionEditar.getModelo());
                    
                    versionEditada = version;
                }
            }
        }
        
        return versionEditada;
        
    }
    
    public boolean eliminarVersion(int id){
        VersionModel versionEliminada = null;
        
        if(!versiones.isEmpty()){
            for (VersionModel version : versiones) {
                if (version.getIdVersion()== id) {
                   versionEliminada = version;
                }
            }
        }
        
        versiones.remove(versionEliminada);
        
        
        return true;
    }
    
    
}
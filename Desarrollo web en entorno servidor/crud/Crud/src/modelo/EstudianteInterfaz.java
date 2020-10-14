package modelo;
import java.util.ArrayList;

public interface EstudianteInterfaz {
public int insertar(Estudiante e);
public ArrayList<Estudiante> consultarTodo();
public int actualizar(Estudiante e);
public int eliminar(int identificador);
public Estudiante buscarPorId(int identificador);
}

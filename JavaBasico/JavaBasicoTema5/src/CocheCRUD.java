import java.util.List;

public interface CocheCRUD {

    public void save(Coche coche);
    public List<Coche> findAll();
    public void delete(Coche coche);

}

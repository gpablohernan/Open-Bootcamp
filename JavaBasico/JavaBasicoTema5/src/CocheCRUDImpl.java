import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    private List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        coches.add(coche);
        System.out.println("save()");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("findAll()");
        return coches;
    }

    @Override
    public void delete(Coche coche) {
        coches.remove(coches);
        System.out.println("delete()");
    }
}

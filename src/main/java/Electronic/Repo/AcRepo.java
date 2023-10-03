package Electronic.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Electronic.Entity.Ac;

public interface AcRepo extends JpaRepository<Ac, Integer> {
	
	@Query(value="select * from Ac where brand like ? ",nativeQuery=true)
	public List<Ac> getByBrand(String brand);
	
	
	@Query(value="select * from Ac where model like ? ",nativeQuery=true)
	public List<Ac> getByModel(String model);
	
	@Query(value="select * from Ac where price>= ? ",nativeQuery=true)
	public List<Ac> getByPriceRange(int price);
	
	@Query(value="select * from Ac where price> ? and price< ? ",nativeQuery=true)
	public List<Ac> getByRange(int range1,int range2);
	
	@Query(value="select * from Ac where price=(select max(price) from Ac)",nativeQuery=true)
	public Ac getmax();
	
	@Query(value="select * from Ac where price=(select min(price) from Ac)",nativeQuery=true)
	public Ac getmin();
	
	@Query(value="select max(price) from Ac",nativeQuery=true)
	public int getMaxi();

	@Query(value="select min(price) from Ac",nativeQuery=true)
	public int getMini();
	
	@Query(value="select * from Ac where model like ? ",nativeQuery=true)
	public List<Ac> getByMod(String model);
	
	@Query(value="select * from Ac where color like ? ",nativeQuery=true)
	public List<Ac> getByCol(String col);
	
	@Query(value="select * from Ac where brand like ? ",nativeQuery=true)
	public List<Ac> upd(String br,String fr);
	
	
	
	

}

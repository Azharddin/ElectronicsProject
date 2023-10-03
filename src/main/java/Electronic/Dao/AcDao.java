package Electronic.Dao;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import Electronic.Entity.Ac;
import Electronic.Exception.modelNotFoundException;
import Electronic.PriceExc.PriceNotFoundException;
import Electronic.Repo.AcRepo;

@Repository
public class AcDao {
	@Autowired
	AcRepo ar;

	public String postAll(List<Ac> s) {
		 ar.saveAll(s);
		 return "Data Saved Successfully";
	}
	public Ac getById(int id) {
		return ar.findById(id).get();		
	}
	public List<Ac> getAll(){
		return  ar.findAll();
	}
	public String update(Ac s) {
		 ar.save(s);
		 return "Update Successfully";
	}
	public String deteleById(int id) {
		 ar.deleteById(id);
		 return "Deleted";
	}
	public List<Ac>getByBrand(String brand) {
		 return ar.getByBrand(brand);
	}
	public List<Ac>getByModel(String model) {
		return ar.getByModel(model);
	}
	public List<Ac>getByPriceRange(int price) {
		return ar.getByPriceRange(price);
	}
	public List<Ac>getByRange(int range1,int range2) {
		return ar.getByRange(range1,range2);
	}
	public Ac getMax() {
		return ar.getmax();
	}
	public Ac getMin() {
		return ar.getmin();
	}
	public int getMaxi() {
		return ar.getMaxi();
	}
	public int getMini() {
		return ar.getMini();
	}
	public List<Ac>getByMod(String mod)  throws Exception{
		if(ar.getByMod(mod).isEmpty()) {
		throw new modelNotFoundException("The Model is Not Found");
		}
		else {
			return ar.getByMod(mod);
		}
		
	}
	public String post(Ac p)  throws Exception{
			ar.save(p);
			return "Data Saved";
	}
	public List<Ac>getByCol(String col)throws Exception{
		return ar.getByCol(col);
	}
	public String posAll(List<Ac> v) throws Exception {
		 ar.saveAll(v);
		 return "Data Saved Successfully";
	}
	public String One(Ac y)  throws Exception{
		ar.save(y);
		return "Data Saved";
	}
	public String up(Ac ad) throws Exception {
		 ar.save(ad);
		 return "Update Successfully";
	}
	public List<Ac>upd(String br,String fr) throws Exception {
		 return ar.upd(br,fr);
	}

	
}

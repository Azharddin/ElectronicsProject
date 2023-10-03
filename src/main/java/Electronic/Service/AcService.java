package Electronic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Electronic.ColorException.ColorException;
import Electronic.Dao.AcDao;
import Electronic.Entity.Ac;
import Electronic.Exception.BrandandPriceNotFoundException;
import Electronic.PriceExc.PriceNotFoundException;
import Electronic.UpdateException.UpdationError;
@Service
public class AcService {
	@Autowired
	AcDao ad;

	public String postAll(List<Ac> s) {
		return ad.postAll(s);
	}
	public Ac getById(int id) {
		return ad.getById(id);
	}
	public List<Ac> getAll(){
		return ad.getAll();
	}
	public String update(Ac s) {
		return ad.update(s);
	}
	public String deteleById(int id) {
		return ad.deteleById(id);
	}
	public List<Ac> getByBrand(String b) {
		return ad.getByBrand(b);
	}
	public List<Ac> getByModel(String c) {
		return ad.getByModel(c);
	}
	public List<Ac> getByPriceRange(int d) {
		return ad.getByPriceRange(d);
	}
	public List<Ac> getByRange(int e,int f) {
		return ad.getByRange(e,f);
	}
	public Ac getMax() {
		return ad.getMax();
	}
	public Ac getMin() {
		return ad.getMin();
	}
	public int getMaxi() {
		return ad.getMaxi();
	}
	public int getMini() {
		return ad.getMini();
	}

	public List<Ac> getByMod(String g) throws Exception {
		return ad.getByMod(g);
	}
	public String  post(Ac r) throws Exception {
		try {
		if(r.getPrice()<=70000) {
			throw new PriceNotFoundException("Price is Not Found");
		}
		else {
			return ad.post(r);
		}
		}
	
		catch(PriceNotFoundException a) {
			return "Error";
		}
	}
	public List<Ac> getByCol(String i) throws Exception{
		List<Ac>x=ad.getByCol(i);
		if(x.isEmpty())
		{
			throw new ColorException("Color Not Found");
		}
		else {
		return ad.getByCol(i);
		}
	}
	public String posAll(List<Ac> v) throws Exception {//Task 1
		Ac a=new Ac();
		if(a.getModelYr()>2020) {
			return ad.posAll(v);
		}
		else {
		throw new PriceNotFoundException("Price Not Found");
	}
	}
	public String  One(Ac y) throws Exception { //Task2
		if(y.getBrand().equals("Croma")&& y.getPrice()>30000) {
			return ad.One(y);
		}
		else {
			throw new BrandandPriceNotFoundException("Price is Not Found");
		}
	}
	public String up(Ac aw) throws Exception { //Task3
		if(aw.getBrand().equals("LG")) {
		return ad.up(aw);
		}
		else {
			throw new UpdationError("Update the Correct Brand");
		}
	}
	public List<Ac> upd(String b,String f) throws Exception {
		List<Ac>x=ad.getByBrand(b);
		if(x.equals("LG")) {
		return ad.upd(f,b);
		}
		else {
			throw new UpdationError("Update the correct Brand");
		}
	}
}

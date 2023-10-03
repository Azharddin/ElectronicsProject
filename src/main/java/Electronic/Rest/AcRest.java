package Electronic.Rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import Electronic.Entity.Ac;
import Electronic.Service.AcService;

@RestController
public class AcRest {
	@Autowired
	AcService as;

	@PostMapping(value = "/postAll")
	public String  postAll(@RequestBody List<Ac> s) {
		return as.postAll(s);
	}
	@GetMapping(value="/getById/{id}")
	public Ac getById(@PathVariable int id) {
		return as.getById(id);
	}
	@GetMapping(value="/getAll")
	public List<Ac> getAll(){                                                                                    
		return as.getAll();
	}
	@PutMapping(value="/update")
	public String update(@RequestBody Ac s) {
		return as.update(s);
	}
	@DeleteMapping(value="delete/{id}")
	public String deteleById(@PathVariable int id) {
		return as.deteleById(id);
	}
	@GetMapping(value="GetByBrand/{b}")
	public List<Ac>  getByBrand(@PathVariable String b) {
		return as.getByBrand(b);
	}
	@GetMapping(value="GetByModel/{c}")
	public List<Ac>  getByModel(@PathVariable String c) {
		return as.getByModel(c);
	}
	@GetMapping(value="GetByPrice/{d}")
	public List<Ac>  getByPriceRange(@PathVariable int d) {
		return as.getByPriceRange(d);
	}
	@GetMapping(value="GetByRange/{e}/{f}")
	public List<Ac>  getByRange(@PathVariable int e,@PathVariable int f) {
		return as.getByRange(e,f);
	}
	@GetMapping(value="GetMax")
	public Ac  getMax() {
		return as.getMax();
	}
	@GetMapping(value="GetMin")
	public Ac  getMin() {
		return as.getMin();
	}
	@GetMapping(value="GetMaxi")
	public int  getMaxi() {
		return as.getMaxi();
	}
	@GetMapping(value="GetMini")
	public int  getMini() {
		return as.getMini();
	}	
	@GetMapping(value="GetByMod/{g}")
	public List<Ac>  getByMod(@PathVariable String g) throws Exception {
		return as.getByMod(g);
	}
	@PostMapping(value="PostOne")
	public String  post(@RequestBody Ac r) throws Exception {
		return as.post(r);
	}
	@GetMapping(value="GetByCol/{i}")
	public List<Ac>  getByCol(@PathVariable String i) throws Exception {
		return as.getByCol(i);
	}
	@PostMapping(value = "/Posall") //Tasl1
	public String  posAll(@RequestBody List<Ac> v) throws Exception {
		return as.posAll(v);
	} 
	@PostMapping(value="/PostOn")  // Task2
	public String  One(@RequestBody Ac y) throws Exception {
		return as.One(y);
	}
	@PutMapping(value="UpdateOne")  //Task3
	public String up(@RequestBody Ac ad) throws Exception {
		return as.up(ad);
	}
	@PutMapping(value="UpdateOn/{ay}/{ad}")
	public List<Ac> upd(@PathVariable String ay,@PathVariable String ad) throws Exception {
		return as.upd(ay,ad);
	}


}

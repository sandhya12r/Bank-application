package in.bank.insurance.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bank.insurance.model.InsuranceModel;

@Repository
public interface InsuranceRepository extends CrudRepository<InsuranceModel, Long>{
	List <InsuranceModel> findByCustomerId(int customerId); 

}

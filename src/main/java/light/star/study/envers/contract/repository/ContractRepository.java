package light.star.study.envers.contract.repository;

import light.star.study.envers.contract.domain.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContractRepository extends JpaRepository<Contract, Long>, RevisionRepository<Contract, Long, Long> {
}

package net.uoneweb.springboottrial;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelProductFireRepository
    extends FirestoreReactiveRepository<FireProductEntity> {}

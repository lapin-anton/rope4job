package ru.lapinlisss.rope4job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lapinlisss.rope4job.model.entity.Site;

@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {
}

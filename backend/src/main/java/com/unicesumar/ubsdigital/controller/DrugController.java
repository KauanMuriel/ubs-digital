package com.unicesumar.ubsdigital.controller;

import com.unicesumar.ubsdigital.model.domain.Drug;
import com.unicesumar.ubsdigital.model.repository.DrugRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/drug")
public class DrugController
{
    private final DrugRepository drugRepository;

    public DrugController(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }

    @PostMapping
    public Drug create(@RequestBody Drug drug) {
        return drugRepository.save(drug);
    }

    @GetMapping("/{id}")
    public Optional<Drug> getById(@PathVariable Integer id) {
        return drugRepository.findById(id);
    }

    @GetMapping()
    public List<Drug> getAll() {
        return drugRepository.findAll();
    }

    @PutMapping("/{id}")
    public Drug update(@RequestBody Drug newDrug, @PathVariable Integer id) {
        return drugRepository.findById(id)
                .map(drug -> {
                    drug.setName(newDrug.getName());
                    drug.setLeaflet(newDrug.getLeaflet());
                    drug.setRecordNumber(newDrug.getRecordNumber());
                    return drugRepository.save(drug);
                }).orElseGet(() -> drugRepository.save(newDrug));
    }

    @DeleteMapping("/id")
    public void delete(@PathVariable Integer id) {
        drugRepository.deleteById(id);
    }
}

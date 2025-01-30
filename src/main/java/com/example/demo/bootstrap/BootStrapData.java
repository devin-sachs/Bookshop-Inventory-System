package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(partRepository.count() == 0) {

            OutsourcedPart glitterSkins = new OutsourcedPart();
            glitterSkins.setCompanyName("Moony Publishing");
            glitterSkins.setName("Glitter Skins");
            glitterSkins.setInv(60);
            glitterSkins.setMinInv(0);
            glitterSkins.setMaxInv(200);
            glitterSkins.setPrice(15);
            glitterSkins.setId(100L);
            outsourcedPartRepository.save(glitterSkins);

            OutsourcedPart lordAndLads = new OutsourcedPart();
            lordAndLads.setCompanyName("Moony Publishing");
            lordAndLads.setName("Lords & Lads");
            lordAndLads.setInv(55);
            lordAndLads.setMinInv(3);
            lordAndLads.setMaxInv(150);
            lordAndLads.setPrice(20);
            lordAndLads.setId(100L);
            outsourcedPartRepository.save(lordAndLads);

            OutsourcedPart happyTimes = new OutsourcedPart();
            happyTimes.setCompanyName("Moony Publishing");
            happyTimes.setName("Happy Times");
            happyTimes.setInv(40);
            happyTimes.setMinInv(2);
            happyTimes.setMaxInv(120);
            happyTimes.setPrice(12);
            happyTimes.setId(100L);
            outsourcedPartRepository.save(happyTimes);

            OutsourcedPart hauntingMoonlight = new OutsourcedPart();
            hauntingMoonlight.setCompanyName("Moony Publishing");
            hauntingMoonlight.setName("Haunting Moonlight");
            hauntingMoonlight.setInv(50);
            hauntingMoonlight.setMinInv(3);
            hauntingMoonlight.setMaxInv(150);
            hauntingMoonlight.setPrice(17);
            hauntingMoonlight.setId(100L);
            outsourcedPartRepository.save(hauntingMoonlight);

            OutsourcedPart itsALoveStory = new OutsourcedPart();
            itsALoveStory.setCompanyName("Its a Love Story");
            itsALoveStory.setName("Its a Love Story");
            itsALoveStory.setInv(60);
            itsALoveStory.setMinInv(1);
            itsALoveStory.setMaxInv(250);
            itsALoveStory.setPrice(14);
            itsALoveStory.setId(100L);
            outsourcedPartRepository.save(itsALoveStory);

        }

//        OutsourcedPart thePart=null;

//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            if(part.getName().equals("out test"))thePart=part;
//        }
//
//        System.out.println(thePart.getCompanyName());

//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            System.out.println(part.getName()+" "+part.getCompanyName());
//        }

        if(productRepository.count() == 0) {

        Product vampireBooks= new Product("Vampire Collection",50.0,35);
        Product fantasyBooks= new Product("Fantasy Collection",75.0,25);
        Product thrillerBooks= new Product("Thriller Collection",40.0,20);
        Product horrorBooks= new Product("Horror Collection",55.0,20);
        Product RomanceBooks= new Product("Romance Collection",60.0,60);

        productRepository.save(vampireBooks);
        productRepository.save(fantasyBooks);
        productRepository.save(thrillerBooks);
        productRepository.save(horrorBooks);
        productRepository.save(RomanceBooks);

//        System.out.println("Started in Bootstrap");
//        System.out.println("Number of Products"+productRepository.count());
//        System.out.println(productRepository.findAll());
//        System.out.println("Number of Parts"+partRepository.count());
//        System.out.println(partRepository.findAll());

        }
    }
}
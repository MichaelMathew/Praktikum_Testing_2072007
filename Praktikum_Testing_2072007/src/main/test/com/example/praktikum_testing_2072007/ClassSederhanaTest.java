package com.example.praktikum_testing_2072007;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassSederhanaTest {

    @BeforeAll
    static void sebelumsemuanya(){
        System.out.println("First Of ALL");
    }

    @Test
    void penghitunganAngka() {
        ClassSederhana cs = new ClassSederhana();
        float expected = 0;
        float actual = (float) ClassSederhana.penghitunganAngka();
        assertEquals(expected,actual,"random");
    }


    @Test
    void menghitungPerkalian() {
        ClassSederhana cs = new ClassSederhana();
        assertEquals(30,ClassSederhana.menghitungPerkalian(),"Perkalian");
    }

    @AfterAll
    static void setelahsemuanya(){
        System.out.println("Selesai");
    }
}
package com.sistemas.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlumno;

    @Column(name = "codigo", nullable = false, length = 11)
    private String codigo;
    
    @Column(name = "fecha_nacimiento", nullable=false)
    private Date fechaNacimiento;
    

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }


}

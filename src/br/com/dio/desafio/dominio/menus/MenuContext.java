package br.com.dio.desafio.dominio.menus;

import br.com.dio.desafio.dominio.models.Bootcamp;
import br.com.dio.desafio.dominio.models.Curso;
import br.com.dio.desafio.dominio.models.Dev;
import br.com.dio.desafio.dominio.models.Mentoria;

import java.util.*;
import java.util.Scanner;

public class MenuContext {
    public final Scanner scanner = new Scanner(System.in);
    public final List<Curso> cursos = new ArrayList<>();
    public final List<Mentoria> mentorias = new ArrayList<>();
    public final List<Bootcamp> bootcamps = new ArrayList<>();
    public final List<Dev> devs = new ArrayList<>();
}
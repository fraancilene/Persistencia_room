package br.com.alura.agenda.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import br.com.alura.agenda.model.Aluno;

@Dao
public interface RoomAlunoDao {

    @Insert
    void salva(Aluno aluno); // inserindo alunos

    // query para buscar aluno
    @Query("SELECT * FROM aluno")
    List<Aluno> todos();

    // remover aluno
    @Delete
    void remove(Aluno aluno);
}

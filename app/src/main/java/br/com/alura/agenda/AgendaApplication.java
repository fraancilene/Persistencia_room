package br.com.alura.agenda;

import android.app.Application;

import androidx.room.Room;

import br.com.alura.agenda.database.AgendaDatabase;
import br.com.alura.agenda.database.dao.RoomAlunoDao;
import br.com.alura.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        // acessando os novos alunos dao, acessando a classe database
        AgendaDatabase database = Room.databaseBuilder(this, AgendaDatabase.class, "agenda.db")
                .allowMainThreadQueries()
                .build(); // devolvendo uma instância

        RoomAlunoDao dao = database.getRoomAlunoDao();


        dao.salva(new Aluno("Alex", "1122223333", "alex@alura.com.br"));
        dao.salva(new Aluno("Fran", "1122223333", "fran@gmail.com"));
    }
}

package com.example.vocacionalsa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Perguntas extends AppCompatActivity {
    TextView pergunta;
    RadioButton rb1, rb2, rb3;
    int n = 1;
    //int ponto = 0;
    int P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14;
    //int Resultado;
    RadioGroup rg;
    Resultado r = new Resultado();
    int PONTORB1 = 15;
    int PONTORB2 = 10;
    int PONTORB3 = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas);
        getSupportActionBar().hide();

        pergunta = findViewById(R.id.pergunta);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rg = findViewById(R.id.rg);
    }




    public void confirmar(View v){
        if(!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked()){
            Toast.makeText(this, "Selecione uma resposta", Toast.LENGTH_SHORT).show();
        }
        else {

            switch (n) {

                case 1: {

                    pergunta.setText("Como você se vê daqui a 10 anos?\n");
                    rb3.setText(" Vivendo e aproveitando cada momento");
                    rb1.setText(" Estudando e construindo minha carreira acadêmica");
                    rb2.setText(" Conquistando todas as minhas ambições");

                    if (rb1.isChecked()) {
                        P1 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P1 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P1 += PONTORB3;
                    }
                    Resultado.P1 = P1;
                    rg.clearCheck();

                    break;
            }

                case 2: {

                    pergunta.setText("Como você lida com opiniões diversas da sua?\n");
                    rb2.setText(" Apenas aceito a opinião da outra pessoa");
                    rb3.setText(" Retruco e imponho a minha opinião");
                    rb1.setText(" Tento entender e opinar de forma pacífica");

                    if (rb1.isChecked()) {
                        P2 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P2 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P2 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P2 = P2;
                    break;
            }

                case 3: {

                    pergunta.setText("Quais atividades você se encaixa melhor?\n");
                    rb2.setText(" Estudo/Pesquisa");
                    rb3.setText(" Criatividade");
                    rb1.setText(" Planejamento/Construção");

                    if (rb1.isChecked()) {
                        P3 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P3 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P3 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P3 = P3;
                    break;
            }

                case 4: {

                    pergunta.setText("Em um caso de problema, como você lida?\n");
                    rb1.setText(" Tento resolver o mais rápido possível");
                    rb3.setText(" Apenas ignoro e deixo acumular");
                    rb2.setText(" Resolvo quando tiver tempo");

                    if (rb1.isChecked()) {
                        P4 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P4 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P4 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P4 = P4;
                    break;
            }

                case 5: {

                    pergunta.setText("Qual impressão você acha que outros têm de você?\n");
                    rb2.setText(" Quieto, inseguro e tímido");
                    rb1.setText(" Otimista, extrovertido, criativo e divertido");
                    rb3.setText(" Arrogante, impulsivo e anti social");

                    if (rb1.isChecked()) {
                        P5 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P5 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P5 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P5 = P5;

                    break;
            }

                case 6: {

                    pergunta.setText("Como você lida com mudanças em um ambiente de trabalho?\n");
                    rb3.setText(" Fico insatisfeito e tento reverter para meu conforto\n");
                    rb2.setText(" Apenas me adapto ao ambiente");
                    rb1.setText(" Fico satisfeito com as mudanças e incentivo coisas novas\n");

                    if (rb1.isChecked()) {
                        P6 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P6 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P6 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P6 = P6;

                    break;
            }

                case 7: {

                    pergunta.setText("Qual sua definição de trabalho ideal?\n");
                    rb2.setText(" Aprender a desenvolver habilidades");
                    rb1.setText(" Ter pessoas trabalhando com o que gostam ");
                    rb3.setText(" Ter conforto na sua área de trabalho");

                    if (rb1.isChecked()) {
                        P7 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P7 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P7 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P7 = P7;

                    break;
                }

                case 8: {

                    pergunta.setText("O que você mais dá valor?");
                    rb2.setText(" Família e amigos");
                    rb1.setText(" Trabalho, dinheiro, conquista");
                    rb3.setText(" Estar bem comigo mesmo, aproveitando as poucas coisas da vida\n");

                    if (rb1.isChecked()) {
                        P8 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P8 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P8 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P8 = P8;

                    break;
                }

                case 9: {

                    pergunta.setText("O que te incomoda em uma situação coletiva?\n");
                    rb2.setText(" Conflito de opiniões ");
                    rb1.setText(" Pessoas que saem mandando no grupo");
                    rb3.setText(" Sobrecarga de responsabilidade");

                    if (rb1.isChecked()) {
                        P9 += PONTORB1;
                    } else if (rb1.isChecked()) {
                        P9 += PONTORB2;
                    } else if (rb1.isChecked()) {
                        P9 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P9 = P9;
                    break;
                }

                case 10: {

                    pergunta.setText("Como você costuma entender as coisas ao seu redor?\n");
                    rb3.setText(" De forma lógica e matemática");
                    rb1.setText(" De modo simples e objetivo");
                    rb2.setText(" Não procuro entender, não me questiono sobre o mundo");

                    if (rb1.isChecked()) {
                        P10 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P10 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P10 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P10 = P10;
                    break;
                }

                case 11: {

                    pergunta.setText("Você pensa nos problemas do mundo?");
                    rb1.setText(" Sim, procuro formas eficazes para diminui-los");
                    rb3.setText(" Não, pois não tenho o poder de mudar esses problemas");
                    rb2.setText(" Penso, mas não costumo ter nenhuma atitude");

                    if (rb1.isChecked()) {
                        P11 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P11 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P11 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P11 = P11;

                    break;
            }

                case 12: {

                    pergunta.setText("Sobre a sua graduação");
                    rb1.setText(" Estudar bastante e aproveitar o máximo ");
                    rb2.setText(" Lugar para aprender e fazer amigos");
                    rb3.setText(" Espero passar o mais rápido possível");

                    if (rb1.isChecked()) {
                        P12 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P12 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P12 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P12 = P12;

                    break;
                }

                case 13: {

                    pergunta.setText("Como você se sobressai no ambiente trabalho?\n");
                    rb2.setText(" Aplicando as habilidades da forma mais eficaz possível");
                    rb1.setText(" Usaria meus conhecimentos para tornar o trabalho mais produtivo");
                    rb3.setText(" Ajudaria meus companheiros de equipe com suas respectivas dúvidas\n");

                    if (rb1.isChecked()) {
                        P13 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P13 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P13 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P13 = P13;

                    break;
                }

                case 14: {

                    pergunta.setText("A pessoa da sua família que você mais admira:\n");
                    rb1.setText(" Estudou bastante e possui uma posição de destaque no mercado de trabalho\n");
                    rb2.setText(" Curte a vida e está sempre descobrindo coisas novas ");
                    rb3.setText(" É bastante criativa e está sempre com novidades.");

                    if (rb1.isChecked()) {
                        P14 += PONTORB1;
                    } else if (rb2.isChecked()) {
                        P14 += PONTORB2;
                    } else if (rb3.isChecked()) {
                        P14 += PONTORB3;
                    }
                    rg.clearCheck();
                    Resultado.P14 = P14;

                }
                break;
                default:

                Intent i = new Intent(this, Resultado.class);
                startActivity(i);


            }
            n++;
        }

    }

}

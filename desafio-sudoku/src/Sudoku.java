import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Classe principal Jogo Sudoku
public class Sudoku {

    //Classe para cada célula do tabuleiro
    class Tile extends JButton{
        int r;
        int c;
        Tile(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    //Dimensões do tabuleiro
    int boardWidth = 600;
    int boardHeight = 650;

    //Dados do puzzle
    String[] puzzle = {
            "47-5-86231",
            "1-5-47-8-6",
            "2-8-91-7-5",
            "5-3-7-64-2",
            "-9-7-12-5-4",
            "6-4-23-9-17",
            "7-5-42-3-6-8",
            "9-8-1-64-5-23",
            "3-2-6-85-1-4-9"
    };

    //Solução do puzzle
    String[] solucao = {
            "479586231",
            "135472896",
            "268913745",
            "513764982",
            "897125364",
            "642398517",
            "754239168",
            "981647253",
            "326851479"
    };

    //Interface Gráfica
    JFrame frame = new JFrame("Sudoku");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();

    //Controle do jogo
    JButton numSelected = null;
    int erros = 0;

    //Configuração inicial da UI
    Sudoku(){

        // Configuração básica da janela
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Configuração do label de texto (contador de erros)
        textLabel.setFont(new Font("Arial", Font.BOLD, 30));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Sudoku: 0");

        // Adiciona componentes ao frame
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        // Configura o painel do tabuleiro
        boardPanel.setLayout(new GridLayout(9,9));
        setupTiles();
        frame.add(boardPanel, BorderLayout.CENTER);

        // Configura os botões numéricos
        buttonsPanel.setLayout(new GridLayout(1,9));
        setupButtons();
        frame.add(buttonsPanel, BorderLayout.SOUTH);


        frame.setVisible(true);
    }

    // Método que cria e configura as células do tabuleiro
    public void setupTiles() {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                Tile tile = new Tile(r, c);
                char tileChar = puzzle[r].charAt(c);

                // Configura células
                if (tileChar != '-') {
                    tile.setFont(new Font("Arial", Font.BOLD, 20));
                    tile.setText(String.valueOf(tileChar));
                    tile.setBackground(Color.lightGray);
                } else {
                    tile.setFont(new Font("Arial", Font.PLAIN, 20));
                    tile.setBackground(Color.white);
                }

                // Configura bordas para marcar os quadrantes 3x3
                if ((r == 2 && c == 2) || (r == 2 && c == 5) || (r == 5 && c == 2) || (r == 5 && c == 5)) {
                    tile.setBorder(BorderFactory.createMatteBorder(1, 1, 5, 5, Color.black));
                } else if (r == 2 || r == 5) {
                    tile.setBorder(BorderFactory.createMatteBorder(1, 1, 5, 1, Color.black));
                } else if (c == 2 || c == 5) {
                    tile.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 5, Color.black));
                } else {
                    tile.setBorder(BorderFactory.createLineBorder(Color.black));
                }


                tile.setFocusable(false);
                boardPanel.add(tile);

                // Listener para clique nas células
                tile.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Tile tile = (Tile) e.getSource();
                        int r = tile.r;
                        int c = tile.c;
                        if (numSelected != null) {
                            if (tile.getText() != "") {
                                return;// Não permite sobrescrever células fixas
                            }
                            String numSelectedText = numSelected.getText();
                            String tileSolution = String.valueOf(solucao[r].charAt(c));

                            // Verifica se o movimento é válido
                            if (tileSolution.equals(numSelectedText)) {
                                tile.setText(numSelectedText);
                            } else {
                                erros += 1;
                                textLabel.setText("Sudoku: " + String.valueOf(erros));
                            }
                        }
                    }
                });
            }
        }
    }

    // Configura os botões numéricos (1-9)
    void setupButtons(){
        for(int i = 1; i < 10; i++){
            JButton button = new JButton();
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setText(String.valueOf(i));
            button.setFocusable(false);
            button.setBackground(Color.white);
            buttonsPanel.add(button);

            // Listener para seleção dos números
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    if(numSelected != null){
                        numSelected.setBackground(Color.white);
                    }
                    numSelected = button;
                    numSelected.setBackground(Color.lightGray);
                }
            });
        }
    }
}

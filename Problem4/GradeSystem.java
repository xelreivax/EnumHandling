package Problem4;

import javax.swing.JOptionPane;

public class GradeSystem {
    public static void main(String[] args) {
        int grade = Integer.parseInt(JOptionPane.showInputDialog("Enter your grade (0-100):"));

        GradeRating rating = grade >= 90 ? GradeRating.EXCELLENT :
                             grade >= 80 ? GradeRating.VERY_GOOD :
                             grade >= 70 ? GradeRating.GOOD :
                             grade >= 60 ? GradeRating.FAIR :
                                           GradeRating.POOR;

        JOptionPane.showMessageDialog(null, "Your rating: " + rating);
    }
}

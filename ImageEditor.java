import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.RescaleOp;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageEditor extends JFrame {
    private BufferedImage originalImage;
    private BufferedImage editedImage;
    private JLabel imageLabel;

    public ImageEditor() {
        // Set up the main window
        setTitle("Image Editor");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Image display area
        imageLabel = new JLabel("No Image Loaded", JLabel.CENTER);
        imageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(imageLabel, BorderLayout.CENTER);

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton openButton = new JButton("Open Image");
        JButton saveButton = new JButton("Save Image");
        JButton resizeButton = new JButton("Resize Image");
        JButton rotateButton = new JButton("Rotate Image");
        JButton grayscaleButton = new JButton("Grayscale");
        JButton blurButton = new JButton("Blur");

        // Add buttons to the panel
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(resizeButton);
        buttonPanel.add(rotateButton);
        buttonPanel.add(grayscaleButton);
        buttonPanel.add(blurButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Button actions
        openButton.addActionListener(e -> openImage());
        saveButton.addActionListener(e -> saveImage());
        resizeButton.addActionListener(e -> resizeImage());
        rotateButton.addActionListener(e -> rotateImage());
        grayscaleButton.addActionListener(e -> applyGrayscale());
        blurButton.addActionListener(e -> applyBlur());

        saveButton.setEnabled(false);  // Enable once an image is loaded
        resizeButton.setEnabled(false);
        rotateButton.setEnabled(false);
        grayscaleButton.setEnabled(false);
        blurButton.setEnabled(false);

        // Load image dynamically
        ActionListener enableButtons = e -> {
            saveButton.setEnabled(true);
            resizeButton.setEnabled(true);
            rotateButton.setEnabled(true);
            grayscaleButton.setEnabled(true);
            blurButton.setEnabled(true);
        };

        openButton.addActionListener(enableButtons);
    }

    private void openImage() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                originalImage = ImageIO.read(file);
                editedImage = originalImage;
                ImageIcon imageIcon = new ImageIcon(editedImage);
                imageLabel.setIcon(imageIcon);
                imageLabel.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error loading image: " + ex.getMessage());
            }
        }
    }

    private void saveImage() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                ImageIO.write(editedImage, "png", file);
                JOptionPane.showMessageDialog(this, "Image saved successfully!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error saving image: " + ex.getMessage());
            }
        }
    }

    private void resizeImage() {
        if (editedImage != null) {
            int newWidth = editedImage.getWidth() / 2;
            int newHeight = editedImage.getHeight() / 2;
            Image scaledImage = editedImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            BufferedImage newImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = newImage.createGraphics();
            g2d.drawImage(scaledImage, 0, 0, null);
            g2d.dispose();
            editedImage = newImage;
            imageLabel.setIcon(new ImageIcon(editedImage));
        }
    }

    private void rotateImage() {
        if (editedImage != null) {
            int width = editedImage.getWidth();
            int height = editedImage.getHeight();
            BufferedImage rotatedImage = new BufferedImage(height, width, editedImage.getType());
            Graphics2D g2d = rotatedImage.createGraphics();
            g2d.translate(height / 2.0, width / 2.0);
            g2d.rotate(Math.toRadians(90));
            g2d.translate(-width / 2.0, -height / 2.0);
            g2d.drawImage(editedImage, 0, 0, null);
            g2d.dispose();
            editedImage = rotatedImage;
            imageLabel.setIcon(new ImageIcon(editedImage));
        }
    }

    private void applyGrayscale() {
        if (editedImage != null) {
            BufferedImage grayscaleImage = new BufferedImage(
                editedImage.getWidth(), editedImage.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
            Graphics g = grayscaleImage.getGraphics();
            g.drawImage(editedImage, 0, 0, null);
            g.dispose();
            editedImage = grayscaleImage;
            imageLabel.setIcon(new ImageIcon(editedImage));
        }
    }

    private void applyBlur() {
        if (editedImage != null) {
            float[] kernel = {
                1f / 9, 1f / 9, 1f / 9,
                1f / 9, 1f / 9, 1f / 9,
                1f / 9, 1f / 9, 1f / 9
            };
            ConvolveOp op = new ConvolveOp(new Kernel(3, 3, kernel));
            editedImage = op.filter(editedImage, null);
            imageLabel.setIcon(new ImageIcon(editedImage));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageEditor editor = new ImageEditor();
            editor.setVisible(true);
        });
    }
}
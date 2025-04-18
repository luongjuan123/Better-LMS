package scr.main.java.com.Schoolar.minilms.model.user;

public enum Gender {
    NAM("Nam"),       // Tương ứng với Male
    NU("Nữ"),;        // Tương ứng với Female


    private final String displayName; // Thêm thuộc tính để có tên hiển thị đẹp (tùy chọn)

    Gender(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Lấy tên hiển thị của giới tính (ví dụ: "Nam", "Nữ").
     * @return Tên hiển thị.
     */
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        // Có thể override toString để trả về tên hiển thị nếu muốn
        return displayName;
        // Hoặc giữ nguyên mặc định: return name(); // Trả về "NAM", "NU", "KHAC"
    }
}

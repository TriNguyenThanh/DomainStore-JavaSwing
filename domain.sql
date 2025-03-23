-- Tạo database
CREATE DATABASE DomainManagement;
USE DomainManagement;

-- Bảng người dùng
CREATE TABLE users (s
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL, 
    email VARCHAR(255) UNIQUE NOT NULL,
    phone VARCHAR(20) UNIQUE NOT NULL,
    cccd VARCHAR(20) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    role ENUM('user', 'admin') DEFAULT 'user',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- bảng quản lý level of domain
CREATE TABLE TopLevelDomain (
	id INT AUTO_INCREMENT PRIMARY KEY,
	TLD_text CHAR(10) NOT NULL,
	price INT UNSIGNED NOT NULL
);

-- Bảng quản lý tên miền
CREATE TABLE domains (
    id INT AUTO_INCREMENT PRIMARY KEY,
    domain_name VARCHAR(255) UNIQUE NOT NULL,
    tld_id int not null,
    foreign key (tld_id) references TopLevelDomain(id),
    status ENUM('available', 'sold') DEFAULT 'available',
    active_date DATE null,
    years int null,
    owner_id INT NULL,
    FOREIGN KEY (owner_id) REFERENCES users(id) ON DELETE SET NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Thêm chỉ mục để tối ưu truy vấn
CREATE INDEX idx_users_email ON users(email);
CREATE INDEX idx_users_phone ON users(phone);
CREATE INDEX idx_domains_name ON domains(domain_name);

-- Thêm tài khoản người dùng đúng cách (không cần chỉ định ID)
INSERT INTO users (full_name, email, phone, cccd, password_hash, role)
VALUES 
('Nguyễn Văn A', 'nguyenvana@example.com', '0987654321', '027205011960', '$argon2i$v=19$m=65536,t=3,p=1$vjx7CyK91uH2LNVdYKNoFg$t8KvU8KGY19ehGwlmG/M1iACv/6mek06tMHLzj+AqTE
', 'user');
-- password: pass123456@


-- Thêm một số topLevelDomain
INSERT INTO TopLevelDomain (TLD_text, price)
VALUES 
('.com', 299000),
('.net', 39000),
('.site', 39000),
('.xyz', 49000),
('.info', 179000),
('.vn', 449000),
('.io.vn', 49000);

-- Thêm một số tên miền mẫu
INSERT INTO domains (domain_name, tld_id, status) 
VALUES 
('example', 1, 'available'),
('testdomain', 6, 'available');

CREATE TABLE Transactions (
    id CHAR(10) PRIMARY KEY NOT NULL,
    user_id INT NOT NULL,
    transaction_date DATE NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id)
);
INSERT INTO Transactions (id, user_id, transaction_date)
VALUES 
('HD001', 1, '2025-03-02');

CREATE TABLE Transactions_info (
    transactions_id CHAR(10) NOT NULL,
    domain_id INT NOT NULL,
   -- domain_years INT NOT NULL,
    price INT UNSIGNED NOT NULL, 
    
    FOREIGN KEY (transactions_id) REFERENCES Transactions(id),
    FOREIGN KEY (Domain_id) REFERENCES domains(id),
    PRIMARY KEY(Domain_id, transactions_id)
);
INSERT INTO Transactions_info (Transactions_id, Domain_id, price)
VALUES 
('HD001', 1, 598000);

CREATE TABLE PaymentMethod (
    id INT AUTO_INCREMENT PRIMARY KEY,
    method ENUM('VNPay', 'MoMo', 'CreditCard', 'ZaloPay')
);
INSERT INTO PaymentMethod (method)
VALUES
('VNPay'),
('MoMo'),
('CreditCard'),
('ZaloPay');

CREATE TABLE PaymentHistory (
    id INT AUTO_INCREMENT PRIMARY KEY,
    transaction_id CHAR(10) NOT NULL,
    payment_id CHAR(10) NOT NULL,
    payment_method INT,
    payment_status ENUM('completed', 'failed'),  
    payment_date DATE,
    
    FOREIGN KEY (transaction_id) REFERENCES Transactions(id),
    FOREIGN KEY (payment_method) REFERENCES PaymentMethod(id)
);

INSERT INTO PaymentHistory (transaction_id, payment_id, payment_method, payment_status, payment_date)
VALUES
('HD001', '68765486', 1, 'completed', '2025-03-02');





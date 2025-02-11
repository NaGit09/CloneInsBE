-- CREATE DATA BASE 
CREATE DATABASE INS ;
USE INS;
DROP DATABASE INS;
-- Bảng Users
CREATE TABLE Users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(50) UNIQUE NOT NULL,
    full_name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    profile_picture VARCHAR(255),
    bio VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- Bảng Posts
CREATE TABLE Posts (
    post_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    caption VARCHAR(255),
    image_url VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE
);


CREATE TABLE Comments (
    comment_id INT PRIMARY KEY AUTO_INCREMENT,
    post_id INT NOT NULL,
    user_id INT NOT NULL,
    content VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (post_id) REFERENCES Posts(post_id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE
);

-- Bảng Likes
CREATE TABLE Likes (
    like_id INT PRIMARY KEY AUTO_INCREMENT,
    post_id INT NOT NULL,
    user_id INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (post_id) REFERENCES Posts(post_id) ON DELETE CASCADE
);

-- Bảng Follows
CREATE TABLE Follows (
    follow_id INT PRIMARY KEY AUTO_INCREMENT,
    follower_id INT NOT NULL,
    followed_id INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (follower_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (followed_id) REFERENCES Users(user_id) ON DELETE CASCADE
);


-- Bảng Messages
CREATE TABLE Messages (
    message_id INT PRIMARY KEY AUTO_INCREMENT,
    sender_id INT NOT NULL,
    receiver_id INT NOT NULL,
    content VARCHAR(500),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (sender_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (receiver_id) REFERENCES Users(user_id) ON DELETE CASCADE
);

-- EXAMPLE DATA 
-- Thêm người dùng
INSERT INTO Users 
VALUES (1, 'NHUTANH09', 'TRAN NHUT ANH', 'nhutanhtran806@gmail.com', 'sfp525kf', '....', 'my love is anh');

-- Thêm bài viết
INSERT INTO Posts (UserId, Caption, ImageUrl) 
VALUES (1, 'My first post!', 'https://example.com/image1.jpg');

-- Thêm bình luận
INSERT INTO Comments (PostId, UserId, Content) 
VALUES (1, 1, 'Great post!');

-- Thêm lượt thích
INSERT INTO Likes (PostId, UserId) 
VALUES (1, 1);

-- Thêm theo dõi
INSERT INTO Follows (FollowerId, FollowedId) 
VALUES (1, 1);

-- Thêm tin nhắn
INSERT INTO Messages (SenderId, ReceiverId, Content) 
VALUES (1, 1, 'Hello there!');
-- 
select * from users;
ALTER TABLE users
    DROP COLUMN user_id,
    DROP COLUMN created_at,
    DROP COLUMN full_name,
    DROP COLUMN password_hash,
    DROP COLUMN profile_picture;


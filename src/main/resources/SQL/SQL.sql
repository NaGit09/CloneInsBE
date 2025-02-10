-- CREATE DATA BASE 
CREATE DATABASE INS ;
USE INS;

-- Bảng Users
CREATE TABLE Users (
    UserId INT PRIMARY KEY AUTO_INCREMENT,
    Username VARCHAR(50) UNIQUE NOT NULL,
    FullName VARCHAR(100),
    Email VARCHAR(100) UNIQUE,
    PasswordHash VARCHAR(255) NOT NULL,
    ProfilePicture VARCHAR(255),
    Bio VARCHAR(255),
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- Bảng Posts
CREATE TABLE Posts (
    PostId INT PRIMARY KEY AUTO_INCREMENT,
    UserId INT NOT NULL,
    Caption VARCHAR(255),
    ImageUrl VARCHAR(255),
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (UserId) REFERENCES Users(UserId) ON DELETE CASCADE
);


CREATE TABLE Comments (
    CommentId INT PRIMARY KEY AUTO_INCREMENT,
    PostId INT NOT NULL,
    UserId INT NOT NULL,
    Content VARCHAR(255) NOT NULL,
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (PostId) REFERENCES Posts(PostId) ON DELETE CASCADE,
    FOREIGN KEY (UserId) REFERENCES Users(UserId) ON DELETE CASCADE
);

-- Bảng Likes
CREATE TABLE Likes (
    LikeId INT PRIMARY KEY AUTO_INCREMENT,
    PostId INT NOT NULL,
    UserId INT NOT NULL,
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (PostId) REFERENCES Posts(PostId) ON DELETE CASCADE,
    FOREIGN KEY (UserId) REFERENCES Users(UserId) ON DELETE CASCADE
);

-- Bảng Follows
CREATE TABLE Follows (
    FollowId INT PRIMARY KEY AUTO_INCREMENT,
    FollowerId INT NOT NULL,
    FollowedId INT NOT NULL,
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (FollowerId) REFERENCES Users(UserId) ON DELETE CASCADE,
    FOREIGN KEY (FollowedId) REFERENCES Users(UserId) ON DELETE CASCADE
);


-- Bảng Messages
CREATE TABLE Messages (
    MessageId INT PRIMARY KEY AUTO_INCREMENT,
    SenderId INT NOT NULL,
    ReceiverId INT NOT NULL,
    Content VARCHAR(500),
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (SenderId) REFERENCES Users(UserId) ON DELETE CASCADE,
    FOREIGN KEY (ReceiverId) REFERENCES Users(UserId) ON DELETE CASCADE
);

-- EXAMPLE DATA 
-- Thêm người dùng
INSERT INTO Users (UserId, Username, FullName, Email, PasswordHash, ProfilePicture, Bio) 
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
select * from users

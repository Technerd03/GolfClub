-- Insert members
INSERT INTO member (id, name, address, email, phone_number, start_date_of_membership, duration_of_membership) VALUES
(1, 'Gale Brawn', '12 South Park', 'Galethecatlover@gmail.com', '445-7768', '2024-01-01', 12),
(2, 'Ellis Ash', '78 Smith Street', 'Ellis2191@hotmail.ca', '221-2312', '2024-02-01', 8);
(3, 'Evan Stevens', '176 Carnaval Lane', 'Esteven231@outlook.com', '221-2453', '2024-01-01', 12),
(4, 'Reginald Walker', '90 Holy Road', 'RegWalker343@gmail.com', '445-5978', '2024-02-01', 10);
-- Insert tournaments
INSERT INTO tournament (id, start_date, end_date, location, entry_fee, cash_prize) VALUES
(1, '2024-03-15', '2024-03-20', 'Green Valley Course', 100.0, 5000.0),
(2, '2024-05-01', '2024-05-05', 'Sunny Golf Resort', 200.0, 10000.0);

-- Insert participating members for tournaments
INSERT INTO tournament_members (tournament_id, member_id) VALUES
(1, 1),
(1, 2),
(1, 4),
(2, 1),
(2, 3),
(2, 4)
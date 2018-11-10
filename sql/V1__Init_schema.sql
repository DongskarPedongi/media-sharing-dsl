--
-- Table structure for table comment
--

CREATE TABLE IF NOT EXISTS comments (
  id serial NOT NULL,
  media_id integer NOT NULL,
  user_id integer NOT NULL,
  text text NOT NULL,
  date date NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

-- --------------------------------------------------------

--
-- Table structure for table like
--

CREATE TABLE IF NOT EXISTS votes (
  media_id integer NOT NULL,
  user_id integer NOT NULL,
  value integer NOT NULL
);

-- --------------------------------------------------------

--
-- Table structure for table media
--

CREATE TABLE IF NOT EXISTS media (
  id serial NOT NULL,
  uploader_id integer NOT NULL,
  name varchar(50) NOT NULL,
  date_added date NOT NULL DEFAULT CURRENT_TIMESTAMP,
  link varchar(100) NOT NULL,
  PRIMARY KEY (id)
);

-- --------------------------------------------------------

--
-- Table structure for table user
--

CREATE TABLE IF NOT EXISTS users (
  id serial NOT NULL,
  username varchar(50) NOT NULL,
  name varchar(50) NOT NULL,
  email varchar(50) NOT NULL,
  password varchar(50) NOT NULL,
  PRIMARY KEY (id)
);

